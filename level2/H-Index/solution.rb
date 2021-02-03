def solution(citations)
  answer = 0
  citations.sort! { |a, b| b <=> a }
  citations.size.times { |i| answer += 1 if citations[i] > i }
  return answer
end

p solution [3, 0, 6, 1, 5]
