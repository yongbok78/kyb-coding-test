def solution(n)
  sqrt = Math.sqrt(n)
  sqrt - sqrt.to_i == 0 ? (sqrt + 1) ** 2 : -1
end

p solution 121
p solution 3
