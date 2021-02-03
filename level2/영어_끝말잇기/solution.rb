def solution(n, words)
  (1...words.size).each do |i|
    if words[i - 1][-1] != words[i][0] || words[0...i].include?(words[i])
      return [i % n + 1, (i / n).to_i + 1]
    end
  end
  return [0, 0]
end

p solution 3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
p solution 5, ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
p solution 2, ["hello", "one", "even", "never", "now", "world", "draw"]
