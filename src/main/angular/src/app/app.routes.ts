import { Routes } from '@angular/router';
import {HelloWorldComponent} from "./component/hello-world/hello-world.component";

export const routes: Routes = [
  {path: '', component: HelloWorldComponent},
  {path: 'hello-world', component: HelloWorldComponent}
];
