def solution(clothes)
  types = {}
  clothes.each { |c| types.has_key?(c[1]) ? types[c[1]] += 1 : types[c[1]] = 1 }

  answer = 1
  types.each_value { |v| answer *= (v + 1) }
  return answer - 1
end

p solution [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
p solution [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]
