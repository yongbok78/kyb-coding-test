def solution(arr, divisor)
  answer = arr.select { |v| (v % divisor).zero? }
  return answer.empty? ? [-1] : answer.sort
end

p solution [5, 9, 7, 10], 5
p solution [2, 36, 1, 3], 1
p solution [3, 2, 6], 10
