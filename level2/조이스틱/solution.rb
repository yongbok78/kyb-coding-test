def solution(name)
  answer = 0
  idxs = []
  name.chars.each_with_index do |s, i|
    # 각 문자 상하 최소 이동거리 더하기
    answer += s > "M" ? "Z".ord - s.ord + 1 : s.ord - "A".ord
    prev = i == 0 ? "" : name[i - 1]
    # 왼쪽부터 A전까지 이동거리
    idxs << i - 1 if s == "A" && prev != s
    # 오른쪽부터 A전까지 이동거리
    idxs << name.size - i if s != "A" && prev == "A"
  end
  # A로 시작하는 경우 처음에 -1이 들어감
  idxs[0] = 0 if idxs[0] == -1
  # 홀수개 인 경우는 뒤쪽에 A가 붙은 경우
  idxs << 0 if idxs.size.odd?

  # 최소 이동거리 계산
  min = name.size - 1
  0.step(idxs.size - 1, 2) do |i|
    sum = idxs[i] + idxs[i + 1]
    min = sum if min > sum
  end
  return answer + min
end

p solution "JEROEN"
p solution "JAN"
p solution "BAAABBBAAABBAABBABBA"
p solution "BBBBBBBBBABB"
p solution "AAAAAAAABAAAAAAAA"
