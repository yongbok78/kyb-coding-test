def solution(s)
  answer = [0, 0]
  loop do
    tmp = s.gsub("0", "")
    answer[0] += 1
    answer[1] += (s.size - tmp.size)
    break if tmp == "1"
    s = tmp.size.to_s(2)
  end
  return answer
end

p solution "110010101001"
p solution "01110"
p solution "1111111"
