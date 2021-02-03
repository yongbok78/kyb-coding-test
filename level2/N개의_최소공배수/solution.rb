def solution(arr)
  arr.reduce(arr[0]) { |lcm, v| lcm.lcm(v) }
end

p solution [2, 6, 8, 14]
p solution [1, 2, 3]
