class Solution:
    def is_palindrome (self, z= int):  
        zstr=str(z)
        if zstr== zstr[::-1]:
            return True
        else:
            return False
        
play=Solution()
solu=play.is_palindrome(235532)
print(solu)