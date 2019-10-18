import {Routes,RouterModule} from '@angular/router'
import { NgModule } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ErrorComponent } from './error/error.component';
import { ListtodoComponent } from './listtodo/listtodo.component';
import { LogoutComponent } from './logout/logout.component';
import { RouteGuardService } from './service/route-guard.service';
import { TodoComponent } from './todo/todo.component';


const routes  : Routes=[
 {path:'', component: LoginComponent},
 {path:'login', component:LoginComponent},
 {path:'welcome/:name',component:WelcomeComponent,canActivate:[RouteGuardService]},
 {path:'todo',component:ListtodoComponent,canActivate:[RouteGuardService]},
 {path:'todo/:id',component:TodoComponent,canActivate:[RouteGuardService]},
 {path:'logout',component:LogoutComponent},
 {path:'logout',component:LogoutComponent},
 {path:'**',component:ErrorComponent}
];

@NgModule({
    imports :[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRouterModule {

}