def solution(x)
  x % x.to_s.chars.inject(0) { |sum, v| sum += v.to_i } == 0
end

p solution 10
p solution 12
p solution 11
p solution 13
