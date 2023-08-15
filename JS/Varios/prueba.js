exterior: for (let i = 0; i < 10; i++) {
    for (let j = 0; j < 10; j++) {
    if(i == 4 && j == 4){
    console.log("Vamos a cortar ambos for");
    break exterior;
    }
    console.log(i+j+10*i);
    }}