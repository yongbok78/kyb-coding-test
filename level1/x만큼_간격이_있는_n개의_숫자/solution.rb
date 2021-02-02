def solution(x, n)
  answer = []
  n.times { |i| answer << x + (x * i) }
  return answer
end

p solution 2, 5
p solution 4, 3
p solution -4, 2
