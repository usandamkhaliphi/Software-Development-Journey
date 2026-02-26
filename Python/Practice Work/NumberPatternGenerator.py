def number_pattern(n):
    
    if type(n) is not int:
        return "Argument must be an integer value."
    
    
    if n <= 0:
        return "Argument must be an integer greater than 0."
    
  
    result = " ".join(str(i) for i in range(1, n + 1))
    return result


print(number_pattern(4))   
print(number_pattern(12))  
print(number_pattern("4")) 
