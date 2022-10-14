import { Component, OnInit } from '@angular/core';
import { Requests } from '../requests';
import { RequestsService } from '../requests.service';

@Component({
  selector: 'app-displayalladhar',
  templateUrl: './displayalladhar.component.html',
  styleUrls: ['./displayalladhar.component.css']
})
export class DisplayalladharComponent implements OnInit {
  requests:Array<Requests>=[]
  constructor(public rs:RequestsService) { }

  ngOnInit(): void {
    this.viewAllRequest();
  }
  viewAllRequest(){
    this.rs.findAllRequest().subscribe({
      next:(result:any)=>this.requests=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
      
    })
    
  }
}
