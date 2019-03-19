public class ScramblerAdd {
    public ScramblerAdd() {
    }

    public int[] tab(int[] inputBits, int[] initialState) {
        int[] outputBits = new int[inputBits.length];

        for(int n = 0; n < inputBits.length; ++n) {
            int temp_14 = initialState[14];
            int temp_15 = initialState[15];
            outputBits[n] = inputBits[n] ^ initialState[14] ^ initialState[15];
            initialState = this.circshift(initialState);
            initialState[1] = temp_14 ^ temp_15;
        }

        return outputBits;
    }

    public int[] circshift(int[] states) {
        int a = states[states.length - 1];
        int[] tab = new int[states.length];

        int i;
        for(i = 0; i < states.length - 1; ++i) {
            tab[i + 1] = states[i];
        }

        tab[0] = a;

        for(i = 0; i < states.length; ++i) {
            states[i] = tab[i];
        }

        return states;
    }
}
