import {Component} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";

@Component({
  selector: 'app-hello-world',
  standalone: true,
  imports: [],
  templateUrl: './hello-world.component.html',
  styleUrl: './hello-world.component.less'
})
export class HelloWorldComponent {
  title: string = 'Demo';
  greeting: any = {};

  constructor(private http: HttpClient) {
    this.http.get('http://localhost:8080/hello-world').subscribe(data => this.greeting = data);
  }
}
