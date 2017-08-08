	// Add your code here
    
    Difference(int [] elements){
        this.elements = elements;
        this.maximumDifference = 0;
    }
    
    int [] getElements(){
        return this.elements;
    }
    
    public int computeDifference(){
        int diff = 0;
        int [] elements = getElements();
        for(int i = 0; i < elements.length; i++){
            for(int j = i+1; j<elements.length; j++){
                 int temp = Math.abs(elements[i] - elements[j]);
                 if(temp > diff) 
                     diff = temp;
             }
        }
        this.maximumDifference = diff;
        return diff;
    }

