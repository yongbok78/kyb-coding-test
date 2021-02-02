def solution(n)
  answer = n
  (1..(n / 2)).each { |i| answer += i if n % i == 0 }
  return answer
end

p solution 12
p solution 5
