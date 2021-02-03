def solution(prices)
  answer = Array.new(prices.size, 0)
  prices.size.times do |i|
    (i + 1...prices.size).each do |j|
      answer[i] += 1
      break if prices[i] > prices[j]
    end
  end
  return answer
end

p solution [1, 2, 3, 2, 3]
