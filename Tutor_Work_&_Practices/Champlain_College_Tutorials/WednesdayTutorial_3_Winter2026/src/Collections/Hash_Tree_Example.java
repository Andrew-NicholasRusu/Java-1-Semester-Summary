package Collections;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class Hash_Tree_Example {

    public static class Node {
        public String hash;
        public Node left;
        public Node right;

        public Node(String hash) {
            this.hash = hash;
        }
    }
    private Node root;

    public Hash_Tree_Example(List<String> dataBlocks) {
        if (dataBlocks == null || dataBlocks.isEmpty()) {
            throw new IllegalArgumentException("Data blocks cannot be empty.");
        }
        List<Node> leafNodes = new ArrayList<>();

        for (String data: dataBlocks) {
            leafNodes.add(new Node(applySha256(data)));
        }

        // Build the tree upwards
        this.root = buildTree(leafNodes);
    }

    // 3. Recursive method to build levels of the tree
    private Node buildTree(List<Node> children) {
        // Base case: we reached the root
        if (children.size() == 1) {
            return children.get(0);
        }
        List<Node> parents = new ArrayList<>();

        // Process pairs of nodes
        for (int i = 0; i < children.size(); i += 2) {
            Node leftChild = children.get(i);
            // If there's an odd number of nodes, duplicate the last one.
            Node rightChild;
            if (i + 1 < children.size()) {
                rightChild = children.get(i+1);
            } else {
                rightChild = leftChild;
            }

            // Concatenate child hashes and hash them to create the parent
            String parentHash = applySha256(leftChild.hash + rightChild.hash);

            Node parent = new Node(parentHash);
            parent.left = leftChild;
            parent.right = rightChild;

            parents.add(parent);
        }

        // Recursively build the next level up
        return buildTree(parents);
    }

    public String getRootHash() {
        return root.hash;
    }

    private static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));
            // Convert
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<String> dataBlocks = new ArrayList<>();
        dataBlocks.add("Transaction A: $10");
        dataBlocks.add("Transaction B: $20");
        dataBlocks.add("Transaction C: $30");
        dataBlocks.add("Transaction D: $40");

        Hash_Tree_Example tree = new Hash_Tree_Example(dataBlocks);

        System.out.println("Original Root Hash: " + tree.getRootHash());

        List<String> tamperedBlocks = new ArrayList<>();
        tamperedBlocks.add("Transaction A: $10");
        tamperedBlocks.add("Transaction B: $2000"); // Tampered data!
        tamperedBlocks.add("Transaction C: $30");
        tamperedBlocks.add("Transaction D: $40");

        Hash_Tree_Example tamperedTree = new Hash_Tree_Example(tamperedBlocks);
        System.out.println("Tampered Root Hash: " + tamperedTree.getRootHash());

    }
}
