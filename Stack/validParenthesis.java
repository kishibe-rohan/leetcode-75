//Question Link: https://leetcode.com/problems/valid-parentheses/

public boolean isValid(String s)
{
  Stack<Character>stack = new Stack<Character>();
  for(char c:s.toCharArray())
  {

    //upon encountering a opening brace
    //push its corresponding closing brace to stack
    if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');

    //on encountering a closing brace
    //check for its pair
    else if(stack.isEmpty() || s.pop() != c)
    return false;
  }

  return s.isEmpty();
}