void call(int cislo) {
    echo "Urci, zda je cislo sude nebo liche -> "
    
    if(cislo % 2 == 0) {
        echo "Cislo ${cislo} je sude"
    } else {
        echo "Cislo ${cislo} je liche"
    }
}
