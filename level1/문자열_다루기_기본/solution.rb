def solution(s)
  [4, 6].include?(s.length) ? s.match(/\D/).nil? : false
end

p solution "a234"
p solution "1234"
p solution ""
