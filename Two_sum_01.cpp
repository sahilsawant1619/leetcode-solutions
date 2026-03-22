#include <vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        
        // Loop through each element as the first number of the pair
        for (int i = 0; i < n; i++) {
            
            // Loop through the elements AFTER 'i' to find the second number
            for (int j = i + 1; j < n; j++) {
                
                // If their sum equals the target, we found the answer!
                if (nums[i] + nums[j] == target) {
                    return {i, j}; // Return the indices as a vector
                }
            }
        }
        
        // This part is just a fallback; the problem guarantees a solution
        return {};
    }
};