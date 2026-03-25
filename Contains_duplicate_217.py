class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        from collections import Counter
        count=Counter(nums)
        result=False
        for num in nums:
            if count[num]>1:
                result=True
                break             
        
        return result;            

    # write function to run this program
    def main():
      nums=[1,2,3,1]
      solution=Solution()
      result=solution.containsDuplicate(nums)
      print(result)    