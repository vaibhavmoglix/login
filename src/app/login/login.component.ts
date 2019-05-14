import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl,Validators,FormBuilder } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { first } from 'rxjs/operators';
 


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  public username: string;
  public password: string;
  public error: string;
  loginForm= this.fb.group({
   
    'username' : ['',[Validators.required,Validators.minLength(3)]],
    'password':['',[Validators.required,Validators.minLength(3)]]
  })
  constructor(private fb: FormBuilder,private auth: AuthService,private router: Router){}
  public submit() {
    this.auth.login( this.username,this.password)
      .pipe(first())
      .subscribe(
        result => this.router.navigate(['dashboard']),
        err => this.error = 'Could not authenticate'
      );
  }
  get uname(){

   return  this.loginForm.get('username')
  }

  get passwordd(){

    return this.loginForm.get('password')
  }

}
