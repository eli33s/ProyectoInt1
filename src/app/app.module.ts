import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoargComponent } from './components/logoarg/logoarg.component';
import { SocialesComponent } from './components/sociales/sociales.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeMiComponent } from './components/acerca-de-mi/acerca-de-mi.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HysComponent } from './components/hys/hys.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import{ HttpClient, HttpClientModule} from '@angular/common/http' 
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoargComponent,
    SocialesComponent,
    BannerComponent,
    AcercaDeMiComponent,
    ExperienciaComponent,
    EducacionComponent,
    HysComponent,
    ProyectoComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
   HttpClient 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
