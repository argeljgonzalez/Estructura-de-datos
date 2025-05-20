from typing import List

class Solution:
    def twoProduct(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] * nums[j] == target:
                    return [i, j]

solu = Solution()
r = solu.twoProduct([4, 8, 9, 24, 8], 64)
print(r)