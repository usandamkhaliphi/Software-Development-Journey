import math
class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height
    
    @property
    def width(self):
        return self._width
    
    @width.setter
    def width(self, width):
        self._width = width
    
    def set_width(self, width):
        self._width = width

    @property
    def height(self):
        return self._height
    
    @height.setter
    def height(self, height):
        self._height = height
    
    def set_height(self, height):
        self.height = height

    def get_area(self):
        area = self.width * self.height
        return area
    
    def get_perimeter(self):
        perimeter = 2 * (self.width + self.height)
        return perimeter
    
    def get_diagonal(self):
        diagonal = math.sqrt((self.width ** 2) + (self.height ** 2))
        return diagonal
    
    def get_picture(self):
        if self.width > 50 or self.height > 50:
            return "Too big for picture."
        else:
            return ('*' * self.width + "\n") * self.height
    
    def get_amount_inside(self, shape):
        return (self.width // shape.width) * (self.height // shape.height)
    
    def __repr__(self) -> str:
        return f"Rectangle(width={self.width}, height={self.height})"
  

class Square(Rectangle):
    def __init__(self, side):
        super().__init__(side, side)
    
    def set_side(self, side):
        self.width = side
        self.height = side
    
    def set_width(self, width):
        self.set_side(width)
    
    def set_height(self, height):
        self.set_side(height)

    def __str__(self):
        return f"Square(side={self.width})"