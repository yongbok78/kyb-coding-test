def solution(a, b)
  a.each_with_index.inject(0) { |sum, (v, i)| sum += v * b[i] }
end

p solution [1, 2, 3, 4], [-3, -1, 0, 2]
p solution [-1, 0, 1], [1, 0, -1]
