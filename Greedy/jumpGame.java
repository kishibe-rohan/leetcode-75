//Question: https://leetcode.com/problems/jump-game/

public boolean jumpGame(int[] jumps)
{

    //maximum reachable so far
    int max = 0;
    for(int i=0;i<jumps.length;i++)
    {

        //position unreachable
        if(max < i)
        return false;

        max = Math.max(max,i+jumps[i]);
    }

    //reached end
    return true;
}