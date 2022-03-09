package HOMEWORK.day22.task2;

public class DefaultStack implements Stack {
    int[] nums;
    int index;
    int MAX_SIZE = 5;

    @Override
    public int push(int val) {

       if (index < MAX_SIZE){
           index++;
           nums[index] = val;

        }else{
           throw new StackIndexOutOfBoundsException(index);
       }
        return val;
    }

    @Override
    public int pop() {
        if (index <= 0){
           nums[index] = 0;
        }else{
            throw new EmptyStackException(index);
        }
        return index;
    }
}

