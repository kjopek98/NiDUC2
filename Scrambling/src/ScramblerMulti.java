public class ScramblerMulti {
    public ScramblerMulti(){
    }
    public int[] scramblingMulti(int[] inputBits, int[] initialState) {
    int[] outputBits = new int[inputBits.length];
    for(int i = 1; i<inputBits.length;i++){
        int a = initialState[18]^initialState[23];
        a = inputBits[i]^a;
        inputBits = ScramblerAdd.circshift(inputBits);
        inputBits[i] = a;
        outputBits[i] = a;
    }
    return outputBits;
    }

}