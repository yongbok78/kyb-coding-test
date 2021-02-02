def solution(s)
  len = s.size
  answer = len.odd? ? s[len / 2] : s[len / 2 - 1..len / 2]
  return answer
end

p solution "abcde"
p solution "qwer"
