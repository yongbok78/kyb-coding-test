def solution(n)
  n.to_s.chars.sort { |a, b| b <=> a }.join.to_i
end

p solution 118372
