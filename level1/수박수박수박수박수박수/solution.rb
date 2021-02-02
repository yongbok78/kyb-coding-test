def solution(n)
  subak = "수박"
  answer = subak * (n / 2)
  if n.odd?
    answer << subak[0]
  end
  return answer
  # 다른 사람 풀이 중에 인상 깊은 표현
  # ("수박" * (n / 2 + 1))[0...n]
end

p solution 3
p solution 4
