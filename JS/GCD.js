// GCD using Euclid’s Algorithm

function GCD(A,B) {
     if(B==0)
        return A;
    else
        return GCD(B, A % B);
}
