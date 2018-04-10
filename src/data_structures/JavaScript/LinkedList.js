function LinkedList(){
  var head = null;
  var length = 0;
  
  var Node = function(element){
    this.element = element;
    this. next = null;
  }
  
  this.add = element =>
  {
    var node = new Node(element);
    if (head === null){
      head = node;
    }
    else {
      var last = head;
      while(last.next){
        last = last.next;
      }
      last.next = node;
    }
    length ++;
  }
  
  this.get = index =>{
    
    if(index < 0 ){
      return null;
    }
    
    var current = head;
    
    for(var i =0; i<length; i++){
      if(i === index){
        return current.element;
      }
      current = current.next;
    }
    return null;
  }
  
  this.remove = element =>{
    var current = head;
    var previous;
    if(head.element == element){
      head = head.next;
      length --;
    }
    else{
      while(current.element !== element){
        previous = current;
        current = current.next;
      }
      previous.next = current.next;
      length --;
    }
  }
  
  this.size = () => { return length}
  
  this.indexOf = element => {
    var current = head;
    for(var i = 0; i<length; i++){
      if(current.element !== element){
        current = current.next;
      }
      else{
        return i;
      }
    }
    return -1;
  }
  
  this.insert = (element, index) =>{
    
        
    if(index <0 || index >= length){
      return ;
    }
    
    var current = head;
    var node = new Node(element);
    var next;

    if(index === 0){
      node.next = head;
      head = node;
    }
    else{
     for(var i = 1; i<index; i++){
        current = current.next;
      }
    next = current.next;
    current.next = node;
    node.next = next;  
    }
    length ++;
  }
  
  this.removeAt = index =>{
    var current = head;
    if(index <0 || index >= length){
      return ;
    }
    if(index === 0){
      head = head.next;
    }
    else{
      for(var i= 1; i<index; i++){
        current = current.next;
      }
      current.next = current.next.next;
    }
    length --;
  }
  
  this.print = () =>{
    var str = '';
    var current = head;
    for(var i =0; i<length; i++){
      str += current.element +  ' -> ';
      current = current.next;
    }
    
    return str.substr(0,str.length-3);
  }
}


var list = new LinkedList();
for(var i =0; i<10; i++){
  list.add(i);
}

console.log(list.print());
console.log(list.size());
console.log(list.indexOf(3));
console.log(list.indexOf(10));
list.insert(-1,0);
console.log(list.print());
list.insert(12,2);
console.log(list.print());
console.log(list.size());
list.removeAt(0);
list.removeAt(1);
console.log(list.print());
console.log(list.get(3));
console.log(list.get(10));
