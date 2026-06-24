class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = Counter(nums)
        freq_list = list(freq.items())
        freq_list.sort(key = lambda pair:pair[1],reverse=True)
        top_k = freq_list[:k]
        result = []
        for num,count in top_k:
            result.append(num)
        
        return result