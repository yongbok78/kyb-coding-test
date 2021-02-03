def solution(priorities, location)
  answer = 0
  # 프린트 할 문서 표시
  printer = priorities.map.with_index { |p, i| [i == location, p] }
  # 우선 순위를 내림차순 정렬 해 놓고
  priorities.sort! { |a, b| b <=> a }

  priorities.each do |max|
    # 우선 순위가 높은 문서 있으면 뒤로 보내고
    loop do
      if printer[0][1] < max
        printer << printer.shift
      else
        break
      end
    end

    answer += 1
    # location에 해당하는 출력물이면 출력하고 끝
    if printer[0][0]
      break
      # 아니면 출력하고 다음 출력물 확인으로 넘어간다.
    else
      printer.shift
    end
  end
  return answer
end

p solution [2, 1, 3, 2], 2
p solution [1, 1, 9, 1, 1, 1], 0
