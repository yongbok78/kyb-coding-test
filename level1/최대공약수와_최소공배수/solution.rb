def solution(n, m)
  [n.gcd(m), n.lcm(m)]
  # gcd, lcm도 고마운데 함께 계산해서 반환해주는 함수도 있고
  # n.gcdlcm(m)
end

p solution 3, 12
p solution 2, 5
