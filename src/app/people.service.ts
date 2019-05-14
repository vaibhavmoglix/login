import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor(private http:HttpClient) {}


  fetchPeople(): Observable<any>{

    return this.http.get('http://localhost:4000/people');
  }
}
