def solution(bridge_length, weight, truck_weights)
  answer = 0
  bridge_weight = 0 # 다리 위 트럭 무게
  bridge = Array.new(bridge_length, 0) # 다리 초기화

  truck_weights.each do |tw|
    answer += 1
    bridge_weight -= bridge.shift

    if weight >= bridge_weight + tw
      bridge_weight += tw
      bridge << tw
    else
      # 다리위에 있는 트럭 무게와 새로 올릴 트럭 무게합이 중량 제한보다 작아질 때까지 다리 위 트럭을 뺀다.
      while weight < bridge_weight + tw
        bridge_weight -= bridge.shift
        bridge << 0
        answer += 1
      end
      bridge_weight += tw
      bridge << tw
    end
  end

  # 다리 위 트럭을 모두 뺀다
  while bridge_weight > 0
    answer += 1
    bridge_weight -= bridge.shift
  end
  return answer
end

p solution 2, 10, [7, 4, 5, 6]
p solution 100, 100, [10]
p solution 100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
