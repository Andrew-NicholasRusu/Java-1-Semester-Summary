def black_white(pixel):
    if pixel < 128:
        return 0
    return 255

for pixel in Nicky.jpg:
    pixel = black_white(pixel)