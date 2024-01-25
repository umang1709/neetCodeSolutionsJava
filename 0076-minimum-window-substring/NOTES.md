//as with matched count we are depicting mapSize(i.e. all characters are matched or not
if(minLen > end - start + 1){
//we are incrementing the minLen if it is greater than window size
minLen = end - start + 1;
//initializing the substr variable with start (i.e. start of the window)
substr = start;
}
//this is some what confusing part as we are removing/deleting the characters here from front of window by incrementing the start
//and checking if that char is concerned or not i.e. if that char is in map or not
//if it is in map and count of that char == 0 then matched will be -- (as matching count will decr now after deleting that character)
//also increasing the counter of character in map as we need to match that character again in upcoming window as we are removing it from current
char deleted = s.charAt(start++);
if(map.containsKey(deleted)){
if(map.get(deleted) == 0)matched--;
map.put(deleted, map.get(deleted)+1);
}
}
}
//at last we are returning the result empty if minLen is still greater than length of string else returning substring, from substr to substr+minLen
return minLen > s.length() ? "" : s.substring(substr, substr+minLen);
}
}