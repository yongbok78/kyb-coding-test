require "prime"

def solution(nums)
  nums.combination(3).count { |arr| Prime.prime? arr.sum }
end

p solution [1, 2, 3, 4]
p solution [1, 2, 7, 6, 4]
