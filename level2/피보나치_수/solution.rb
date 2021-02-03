def solution(n)
  answer = [0, 1]
  (2..n).each { |i| answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567 }
  return answer[n]
end

p solution 3
p solution 5
