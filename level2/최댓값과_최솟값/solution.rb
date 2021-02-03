def solution(s)
  tmp = s.split(" ").sort { |a, b| a.to_i <=> b.to_i }
  return "#{tmp.first} #{tmp.last}"
end

# 다른 사람 풀이. Ruby에는 신박한 메소드가 참 많다는 걸 계속 느낀다
def solution2(s)
  s.split.map(&:to_i).minmax.join(" ")
end

p solution "1 2 3 4"
p solution "-1 -2 -3 -4"
p solution "-1 -1"
