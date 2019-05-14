import { Component } from '@angular/core';
import { PeopleService } from '../people.service';
import {people} from '../peopleint'
import {Observable} from 'rxjs'

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent  {
  private people:people[]=[];

  constructor(private peopleService:PeopleService) { 
  

  

   

  

}

fetchPeople(){
  this.peopleService.fetchPeople().subscribe((res : any[])=>{
    console.log(res);
    this.people = res;
    });

}
}

