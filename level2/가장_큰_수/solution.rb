def solution(numbers)
  r = numbers.map(&:to_s).sort { |a, b| (b + a) <=> (a + b) }
  return r[0] == "0" ? "0" : r.join
end

p solution [6, 10, 2]
p solution [3, 30, 34, 5, 9]
