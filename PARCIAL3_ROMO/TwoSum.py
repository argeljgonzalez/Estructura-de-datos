
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapa = {}  # valor -> índice

        for i, num in enumerate(nums):
            complemento = target - num

            # Si el complemento ya está en el mapa, devolvemos los índices
            if complemento in mapa:
                return [mapa[complemento], i]

            # Guardamos el valor actual y su índice
            mapa[num] = i

solu=Solution()
nums= [3,8,12,15,7]
target=19
resultado=solu.twoSum(nums,target)
print(resultado)
