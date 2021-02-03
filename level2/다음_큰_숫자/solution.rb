def solution(n)
  answer = 0
  ones = n.to_s(2).gsub("0", "")
  loop do
    n += 1
    if ones == n.to_s(2).gsub("0", "")
      answer = n
      break
    end
  end
  return answer
end

# 다른 사람 풀이, ?1이 무슨 의미인지 찾아 봐야겠네
def solution2(n)
  k = n.to_s(2).count(?1)
  t = n + 1
  until t.to_s(2).count(?1) == k
    t += 1
  end
  t
end

p solution 78
p solution 15
