def solution(progresses, speeds)
  answer = []
  end_days = []
  # 작업 일수 계산
  progresses.each_with_index do |p, i|
    days = 0
    until p >= 100
      p += speeds[i]
      days += 1
    end
    end_days << days
  end

  # 배포수 정리
  before = end_days[0]
  answer << 1
  i = 0
  end_days[1..].each do |d|
    if before >= d
      answer[i] += 1
    else
      i += 1
      answer << 1
      before = d
    end
  end
  return answer
end

p solution [93, 30, 55], [1, 30, 5]
p solution [95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]
